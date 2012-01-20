/**
 * Mule GitHub Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.config;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class GitHubModuleNamespaceTest extends FunctionalTestCase {

    @Override
    protected String getConfigResources() {
        return "mule-config.xml";
    }

    @Test
    public void checkSchemaIsValid() {
        // by loading the mule-config.xml will validate the schema is deployable in Mule
    }
}