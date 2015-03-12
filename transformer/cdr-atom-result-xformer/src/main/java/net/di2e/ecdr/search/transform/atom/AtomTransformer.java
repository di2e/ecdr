/**
 * Copyright (C) 2014 Cohesive Integrations, LLC (info@cohesiveintegrations.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.di2e.ecdr.search.transform.atom;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.activation.MimeType;

import net.di2e.ecdr.commons.CDRMetacard;
import net.di2e.ecdr.search.transform.atom.security.FeedSecurityConfiguration;

import org.apache.abdera.model.Entry;
import org.apache.abdera.model.Feed;
import org.codice.ddf.configuration.impl.ConfigurationWatcherImpl;

import ddf.action.ActionProvider;
import ddf.catalog.operation.SourceResponse;

public class AtomTransformer extends AbstractAtomTransformer {

    public AtomTransformer( ConfigurationWatcherImpl configWatcher, ActionProvider viewMetacardProvider, ActionProvider metadataProvider, ActionProvider resourceProvider,
            ActionProvider thumbnailProvider, MimeType thumbnailMime, MimeType viewMime, List<FeedSecurityConfiguration> securityConfig ) {
        super( configWatcher, viewMetacardProvider, metadataProvider, resourceProvider, thumbnailProvider, thumbnailMime, viewMime, securityConfig );
    }

    @Override
    public void addFeedElements( Feed feed, SourceResponse response, Map<String, Serializable> properties ) {
    }

    @Override
    public void addEntryElements( Entry entry, CDRMetacard metacard, Map<String, Serializable> properties ) {
    }

}
