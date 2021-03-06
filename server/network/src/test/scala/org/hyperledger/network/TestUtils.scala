/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hyperledger.network

import java.net.{InetAddress, InetSocketAddress}
import java.time.{Instant, ZoneId, Clock}

object TestUtils {

  def createVersion(nonce: Long) = Version.forNow(
    0L,
    Version.SIMPLE_NODE,
    NetworkAddress.forVersion(Version.SIMPLE_NODE, new InetSocketAddress(InetAddress.getLocalHost, 8555)),
    NetworkAddress.forVersion(Version.SIMPLE_NODE, new InetSocketAddress(InetAddress.getLocalHost, 8666)),
    nonce,
    "Test Node",
    3, relay = true)

}
