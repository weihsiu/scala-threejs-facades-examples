package examples

import typings.three.*

import scala.language.adhocExtensions
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object TroikaThreeText:
  @js.native
  @JSImport("troika-three-text", "Text")
  class Text extends core.Object3D:
    var text: String = js.native
    var anchorX: Double | String = js.native
    var anchorY: Double | String = js.native
    var clipRect: js.Array[Double] = js.native
    var color: Int | String = js.native
    var font: String = js.native
    var fontSize: Double = js.native
    var material: materials.Material = js.native
    def sync(): Unit = js.native
