/*
###############################################################################
#                                                                             # 
#    Copyright 2016, AdeptJ (http://www.adeptj.com)                           #
#                                                                             #
#    Licensed under the Apache License, Version 2.0 (the "License");          #
#    you may not use this file except in compliance with the License.         #
#    You may obtain a copy of the License at                                  #
#                                                                             #
#        http://www.apache.org/licenses/LICENSE-2.0                           #
#                                                                             #
#    Unless required by applicable law or agreed to in writing, software      #
#    distributed under the License is distributed on an "AS IS" BASIS,        #
#    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. #
#    See the License for the specific language governing permissions and      #
#    limitations under the License.                                           #
#                                                                             #
###############################################################################
*/

package com.adeptj.runtime.ext;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.EventListener;

/**
 * Stores the OSGi web console password as a variable.
 *
 * @author Rakesh.Kumar, AdeptJ
 */
public class WebConsolePasswordChangeListener implements EventListener {

    private volatile char[] password;

    public char[] getPassword() {
        return this.password;
    }

    public void onPasswordChange(String pwd) {
        this.password = StringUtils.isEmpty(pwd) ? null : pwd.toCharArray();
    }

    public boolean isPasswordNotEmpty() {
        return ArrayUtils.isNotEmpty(this.password);
    }
}
