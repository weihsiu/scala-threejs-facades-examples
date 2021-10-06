package examples

import examples.TroikaThreeText.*
import org.scalajs.dom
import typings.three.*

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TestMain:
  def main(args: Array[String]): Unit =
    val scene = scenes.Scene()

    val camera = cameras.PerspectiveCamera(
      75,
      dom.window.innerWidth / dom.window.innerHeight,
      0.1,
      1000
    )
    camera.position.z = 5

    val renderer = renderers.WebGLRenderer()
    renderer.setSize(dom.window.innerWidth, dom.window.innerHeight)
    dom.document.body.appendChild(renderer.domElement)

    val geometry = geometries.BoxGeometry()
    val material = materials.MeshPhongMaterial(new { color = 0x00ff00 })
    val cube = objects.Mesh(geometry, material)
    scene.add(cube)

    val text = Text()
    text.text = "Hello Bundling!"
    text.fontSize = 0.2
    text.position.x = 5
    text.position.z = -2
    text.color = 0x9966ff
    text.sync()
    scene.add(text)

    val light = lights.DirectionalLight(0xffffff, 1)
    light.position.set(-1, 2, 4)
    scene.add(light)

    lazy val animate: Double => Unit = time =>
      dom.window.requestAnimationFrame(animate)

      cube.rotation.x += 0.01
      cube.rotation.y += 0.01

      renderer.render(scene, camera)

    animate(0)
