/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hama.bsp;

import java.io.IOException;

import org.apache.hadoop.conf.Configurable;
import org.apache.zookeeper.KeeperException;

/**
 * Interface BSP defines the basic operations needed to implement the BSP
 * algorithm.
 */
public interface BSPInterface<K1, V1, K2, V2> extends Configurable {

  /**
   * A user defined function for programming in the BSP style.
   * 
   * Applications can use the {@link org.apache.hama.bsp.BSPPeer} to handle the
   * communication and synchronization between processors.
   * 
   * @param bspPeer
   * @throws IOException
   * @throws KeeperException
   * @throws InterruptedException
   */
  public void bsp(BSPPeer bspPeer, RecordReader<K1, V1> input,
      OutputCollector<K2, V2> output) throws IOException, KeeperException,
      InterruptedException;
}
