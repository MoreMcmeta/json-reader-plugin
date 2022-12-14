/*
 * JSON Reader Plugin is a plugin for MoreMcmeta that reads JSON metadata files.
 * Copyright (C) 2022 soir20
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.moremcmeta.jsonreaderplugin.forge;

import io.github.moremcmeta.jsonreaderplugin.ModConstants;
import io.github.moremcmeta.moremcmeta.api.client.MoreMcmetaMetadataReaderPlugin;
import io.github.moremcmeta.moremcmeta.api.client.metadata.MetadataReader;
import io.github.moremcmeta.moremcmeta.forge.api.client.MoreMcmetaClientPlugin;

/**
 * Implementation of the JSON reader plugin on Forge.
 * @author soir20
 */
@MoreMcmetaClientPlugin
@SuppressWarnings("unused")
public class JsonReaderPluginForge implements MoreMcmetaMetadataReaderPlugin {

    @Override
    public String extension() {
        return ModConstants.EXTENSION;
    }

    @Override
    public MetadataReader metadataReader() {
        return ModConstants.READER;
    }

    @Override
    public String displayName() {
        return ModConstants.DISPLAY_NAME;
    }
}
