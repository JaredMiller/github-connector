/**
 * Mule GitHub Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.github;

public enum TeamPermission {

    /**
     * Team members can pull, but not push or administer this repositories
     */
    PULL,
    /**
     * Team members can pull and push, but not administer this repositores.
     */
    PUSH,
    /**
     * Team members can pull, push and administer these repositories.
     */
    ADMIN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}