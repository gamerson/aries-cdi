/**
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

package org.apache.aries.cdi.test.tb21;

import org.apache.aries.cdi.extra.RequireCDIExtension;
import org.apache.aries.cdi.test.interfaces.Pojo;
import org.osgi.service.cdi.annotations.Bean;
import org.osgi.service.cdi.annotations.Service;

@Bean
@RequireCDIExtension("aries.cdi.jndi")
@Service
public class A implements Pojo {

	@Override
	public String foo(String input) {
		return "JNDI:" + input;
	}

	@Override
	public int getCount() {
		return 0;
	}

}
