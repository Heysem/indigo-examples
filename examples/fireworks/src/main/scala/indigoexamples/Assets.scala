package indigoexamples

import indigo.*

object Assets {

  val assets: Set[AssetType] =
    Set(
      AssetType.Image(AssetName("graphics"), AssetPath("assets/graphics.png"))
    )

  val cross: Graphic[Material.ImageEffects] =
    Graphic(0, 0, 3, 3, 1, Material.ImageEffects(AssetName("graphics")))

}
