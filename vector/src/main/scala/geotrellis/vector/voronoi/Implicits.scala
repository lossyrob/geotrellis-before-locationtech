/*
 * Copyright 2016 Azavea
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

package geotrellis.vector.voronoi

import geotrellis.vector.Point

object Implicits extends Implicits

trait Implicits {
  implicit class withDelaunayTriangulationMethods(val self: Traversable[Point]) extends DelaunayTriangulationMethods

  implicit class withDelaunayTriangulationArrayMethods(val self: Array[Point]) extends DelaunayTriangulationArrayMethods

  implicit class withVoronoiDiagramMethods(val self: Traversable[Point]) extends VoronoiDiagramMethods

  implicit class withVoronoiDiagramArrayMethods(val self: Array[Point]) extends VoronoiDiagramArrayMethods
}
