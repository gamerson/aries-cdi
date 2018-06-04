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

package org.apache.aries.cdi.container.test.beans.ctordynamicreluctant;

import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Provider;

import org.apache.aries.cdi.container.test.beans.Foo;
import org.osgi.service.cdi.annotations.Reference;
import org.osgi.service.cdi.annotations.Reluctant;

public class CtorFooOptional {
	@Inject
	public CtorFooOptional(@Reluctant @Reference Provider<Optional<Foo>> foo) {}
}