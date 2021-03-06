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
package org.apache.pulsar.manager.service;

import org.apache.pulsar.manager.entity.RoleInfoEntity;

import java.util.Map;
import java.util.Set;

public interface RolesService {

    Map<String, String> validateRoleInfoEntity(RoleInfoEntity roleInfoEntity);

    void createDefaultRoleAndTenant(String tenant);

    Set<String> getResourceVerbs(String resourceVerbs);

    Map<String, String> validateCurrentTenant(String token, String tenant);
}
