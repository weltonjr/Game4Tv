package ninja.welton.game4tv.scenes

import com.silvano.AndGraph.*
import ninja.welton.game4tv.R

/**
 * Created by welton.ferreira on 28/02/2018.
 */
class HomeMenu(manager: AGGameManager) : AGScene(manager) {
    private var botao: AGSprite? = null

    override fun init() {
        setSceneBackgroundColor(1f, 1f, 1f)

        botao = this.createSprite(R.mipmap.ic_launcher, 2, 1)
//        botao?.setScreenPercent(55, 15)

        //Altura e Largura
//        botao?.vrPosition?.x = (AGScreenManager.iScreenWidth / 2).toFloat()
//        botao?.vrPosition?.y = (AGScreenManager.iScreenHeight / 2).toFloat()
    }

    override fun restart() {

    }

    override fun stop() {

    }

    override fun loop() {
//        if (AGInputManager.vrTouchEvents.screenClicked()) {
//            if (botao!!.collide(AGInputManager.vrTouchEvents.lastPosition)) {
//                this.vrGameManager.setCurrentScene(1)
//            }
//        }
    }
}