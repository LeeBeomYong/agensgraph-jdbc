/*
 * Copyright (c) 2014-2018, Bitnine Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.bitnine.agensgraph.util;

public final class DriverInfo {
    private DriverInfo() {
    }

    public static final String DRIVER_NAME = "AgensGraph JDBC Driver";
    public static final String DRIVER_VERSION = "1.4.2";
    public static final String DRIVER_FULL_NAME = DRIVER_NAME + " " + DRIVER_VERSION;

    public static final int MAJOR_VERSION = 1;
    public static final int MINOR_VERSION = 4;
    public static final int PATCH_VERSION = 2;
}
