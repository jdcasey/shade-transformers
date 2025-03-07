/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.richfaces.build.shade.resource;

/**
 * @author Nick Belaevski
 *
 */
public class Taglib {

    private String targetNamespace;

    private String sourceNamespacesPattern;

    public String getTargetNamespace() {
        return targetNamespace;
    }

    public void setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    public String getSourceNamespacesPattern() {
        return sourceNamespacesPattern;
    }

    public void setSourceNamespacesPattern(String sourceNamespacesPattern) {
        this.sourceNamespacesPattern = sourceNamespacesPattern;
    }

    public boolean matches(String namespace) {
        if (sourceNamespacesPattern == null || sourceNamespacesPattern.length() == 0) {
            return targetNamespace.equals(namespace);
        }

        return namespace.matches(sourceNamespacesPattern);
    }
}
