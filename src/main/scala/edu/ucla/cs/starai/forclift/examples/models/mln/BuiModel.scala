/*
 * Copyright 2016 Guy Van den Broeck and Wannes Meert (UCLA and KU Leuven)
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

package edu.ucla.cs.starai.forclift.examples.models.mln

import edu.ucla.cs.starai.forclift._
import examples.models._

class BuiModel(
  domainSize: Int) extends MLNModel {

  def theoryString = (
    "d = " + (1 to domainSize).map { "N" + _ }.mkString("{", ", ", "}") + """
P(d,d)
1.1 P(x,y) ^ P(y,z)
""")

}