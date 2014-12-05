/*
 * Copyright 2014 Jeanfrancois Arcand
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.util;

import org.atmosphere.cpr.AnnotationProcessor;
import org.atmosphere.cpr.AtmosphereFramework;

import java.io.File;
import java.io.IOException;

/**
 * An {@link org.atmosphere.cpr.AnnotationProcessor} that does nothing.
 *
 * @author Jeanfrancois Arcand
 */
public class VoidAnnotationProcessor implements AnnotationProcessor {
    @Override
    public AnnotationProcessor configure(AtmosphereFramework framework) {
        return null;
    }

    @Override
    public AnnotationProcessor scan(File rootDir) throws IOException {
        return this;
    }

    @Override
    public AnnotationProcessor scan(String packageName) throws IOException {
        return this;
    }

    @Override
    public AnnotationProcessor scanAll() throws IOException {
        return this;
    }

    @Override
    public void destroy() {

    }
}
