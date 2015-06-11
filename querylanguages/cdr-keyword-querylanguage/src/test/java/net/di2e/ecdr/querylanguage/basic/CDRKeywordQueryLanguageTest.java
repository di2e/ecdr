/**
 * Copyright (c) Cohesive Integrations, LLC
 *
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation, either version 3 of the License, or any later version. 
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details. A copy of the GNU Lesser General Public License is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 * 
 **/
package net.di2e.ecdr.querylanguage.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Collections;

import javax.ws.rs.core.MultivaluedMap;

import net.di2e.ecdr.commons.constants.SearchConstants;
import net.di2e.ecdr.commons.sort.SortTypeConfiguration;
import net.di2e.ecdr.querylanguage.basic.GeospatialCriteria.SpatialOperator;

import org.apache.cxf.jaxrs.impl.MetadataMap;
import org.junit.Test;

import ddf.catalog.filter.FilterBuilder;

/**
 * Unit tests for BasicQueryParser class
 */
public class CDRKeywordQueryLanguageTest {

    @Test
    public void testGeospatialBasicQueryParser() throws Exception {
        FilterBuilder filterBuilder = mock( FilterBuilder.class );
        CDRKeywordQueryLanguage lang = new CDRKeywordQueryLanguage( filterBuilder, Collections.<SortTypeConfiguration> emptyList() );

        // point radius
        GeospatialCriteria geospatialCriteria = lang.createGeospatialCriteria( "5", "10", "15", null, null, null, SpatialOperator.Contains.toString(), 10.0 );
        assertTrue( geospatialCriteria.isPointRadius() );
        assertFalse( geospatialCriteria.isBBox() );
        assertEquals( new Double( 5.0 ), geospatialCriteria.getRadius() );
        assertEquals( new Double(10.0), geospatialCriteria.getLatitude());
        assertEquals( new Double( 15.0 ), geospatialCriteria.getLongitude() );
        assertEquals( SpatialOperator.Contains, geospatialCriteria.getSpatialOperator() );

        // bbox
        geospatialCriteria = lang.createGeospatialCriteria( null, null, null, "-1 -2 3 4", null, null, SpatialOperator.Overlaps.toString(), 10.0 );
        assertTrue( geospatialCriteria.isBBox() );
        assertFalse( geospatialCriteria.isPointRadius() );
        assertEquals( "POLYGON((-1.0 -2.0,-1.0 4.0,3.0 4.0,3.0 -2.0,-1.0 -2.0))", geospatialCriteria.getGeometryWKT() );
        assertEquals( SpatialOperator.Overlaps, geospatialCriteria.getSpatialOperator() );

        // geometry
        geospatialCriteria = lang.createGeospatialCriteria( null, null, null, null, "POLYGON((-5.0 -6.0,-5.0 4.0,3.0 4.0,3.0 -6.0,-5.0 -6.0))", null, SpatialOperator.Within.toString(), 10.0 );
        assertEquals( "POLYGON((-5.0 -6.0,-5.0 4.0,3.0 4.0,3.0 -6.0,-5.0 -6.0))", geospatialCriteria.getGeometryWKT() );
        assertFalse( geospatialCriteria.isBBox() );
        assertFalse( geospatialCriteria.isPointRadius() );
        assertEquals( SpatialOperator.Within, geospatialCriteria.getSpatialOperator() );

        // polygon
        geospatialCriteria = lang.createGeospatialCriteria( null, null, null, null, null, "-5.0, -166.0,-5.0, 4.0,3.0, 4.0,3.0, -166.0,-5.0, -166.0", null, 10.0 );
        assertEquals( "POLYGON((-166.0 -5.0,-166.0 3.0,4.0 3.0,4.0 -5.0,-166.0 -5.0))", geospatialCriteria.getGeometryWKT() );
        assertFalse( geospatialCriteria.isBBox() );
        assertFalse( geospatialCriteria.isPointRadius() );
        assertEquals( SpatialOperator.Overlaps, geospatialCriteria.getSpatialOperator() );

        geospatialCriteria = lang.createGeospatialCriteria( null, null, null, null, "POLYGON((-5.0 -6.0,-5.0 4.0,3.0 4.0,3.0 -6.0,-5.0 -6.0))", null, SpatialOperator.Disjoint.toString(), 10.0 );
        assertEquals( "POLYGON((-5.0 -6.0,-5.0 4.0,3.0 4.0,3.0 -6.0,-5.0 -6.0))", geospatialCriteria.getGeometryWKT() );
        assertFalse( geospatialCriteria.isBBox() );
        assertFalse( geospatialCriteria.isPointRadius() );
        assertEquals( SpatialOperator.Disjoint, geospatialCriteria.getSpatialOperator() );

    }

    @Test
    public void testTemporalBasicQueryParser() throws Exception {
        FilterBuilder filterBuilder = mock( FilterBuilder.class );
        CDRKeywordQueryLanguage lang = new CDRKeywordQueryLanguage( filterBuilder, Collections.<SortTypeConfiguration> emptyList() );

        lang.createTemporalCriteria( "2014-05-05T00:00:00Z", "2014-05-05T00:00:00Z", "created", new StringBuilder(), "default" );
        lang.createTemporalCriteria( "2014-05-05T00:00:00Z", "2014-05-05T00:00:00Z", "", new StringBuilder(), "created" );
    }

    @Test
    public void testKeywordFuzzyBasicQueryParser() throws Exception {
        FilterBuilder filterBuilder = mock( FilterBuilder.class );
        CDRKeywordQueryLanguage lang = new CDRKeywordQueryLanguage( filterBuilder, Collections.<SortTypeConfiguration> emptyList() );
        MultivaluedMap<String, String> props = new MetadataMap<String, String>();

        props.putSingle( SearchConstants.KEYWORD_PARAMETER, "test" );
        TextualCriteria criteria = lang.getTextualCriteria( props, false );
        assertTrue( !criteria.isFuzzy() );

        criteria = lang.getTextualCriteria( props, true );
        assertTrue( criteria.isFuzzy() );

        props.putSingle( SearchConstants.FUZZY_PARAMETER, "1" );
        criteria = lang.getTextualCriteria( props, false );
        assertTrue( criteria.isFuzzy() );

        props.remove( SearchConstants.FUZZY_PARAMETER );
        props.putSingle( SearchConstants.FUZZY_PARAMETER, "0" );
        criteria = lang.getTextualCriteria( props, true );
        assertTrue( !criteria.isFuzzy() );

    }

}
