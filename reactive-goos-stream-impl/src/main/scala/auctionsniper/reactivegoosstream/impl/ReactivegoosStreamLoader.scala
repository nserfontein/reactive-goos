package auctionsniper.reactivegoosstream.impl

import com.lightbend.lagom.scaladsl.api.ServiceLocator.NoServiceLocator
import com.lightbend.lagom.scaladsl.server._
import com.lightbend.lagom.scaladsl.devmode.LagomDevModeComponents
import play.api.libs.ws.ahc.AhcWSComponents
import auctionsniper.reactivegoosstream.api.ReactivegoosStreamService
import auctionsniper.reactivegoos.api.ReactivegoosService
import com.softwaremill.macwire._

class ReactivegoosStreamLoader extends LagomApplicationLoader {

  override def load(context: LagomApplicationContext): LagomApplication =
    new ReactivegoosStreamApplication(context) {
      override def serviceLocator = NoServiceLocator
    }

  override def loadDevMode(context: LagomApplicationContext): LagomApplication =
    new ReactivegoosStreamApplication(context) with LagomDevModeComponents

  override def describeService = Some(readDescriptor[ReactivegoosStreamService])
}

abstract class ReactivegoosStreamApplication(context: LagomApplicationContext)
  extends LagomApplication(context)
    with AhcWSComponents {

  // Bind the service that this server provides
  override lazy val lagomServer = serverFor[ReactivegoosStreamService](wire[ReactivegoosStreamServiceImpl])

  // Bind the ReactivegoosService client
  lazy val reactivegoosService = serviceClient.implement[ReactivegoosService]
}
