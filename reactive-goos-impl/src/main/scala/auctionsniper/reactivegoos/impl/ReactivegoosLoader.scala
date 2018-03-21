package auctionsniper.reactivegoos.impl

import com.lightbend.lagom.scaladsl.api.ServiceLocator
import com.lightbend.lagom.scaladsl.api.ServiceLocator.NoServiceLocator
import com.lightbend.lagom.scaladsl.persistence.cassandra.CassandraPersistenceComponents
import com.lightbend.lagom.scaladsl.server._
import com.lightbend.lagom.scaladsl.devmode.LagomDevModeComponents
import play.api.libs.ws.ahc.AhcWSComponents
import auctionsniper.reactivegoos.api.ReactivegoosService
import com.lightbend.lagom.scaladsl.broker.kafka.LagomKafkaComponents
import com.softwaremill.macwire._

class ReactivegoosLoader extends LagomApplicationLoader {

  override def load(context: LagomApplicationContext): LagomApplication =
    new ReactivegoosApplication(context) {
      override def serviceLocator: ServiceLocator = NoServiceLocator
    }

  override def loadDevMode(context: LagomApplicationContext): LagomApplication =
    new ReactivegoosApplication(context) with LagomDevModeComponents

  override def describeService = Some(readDescriptor[ReactivegoosService])
}

abstract class ReactivegoosApplication(context: LagomApplicationContext)
  extends LagomApplication(context)
    with CassandraPersistenceComponents
    with LagomKafkaComponents
    with AhcWSComponents {

  // Bind the service that this server provides
  override lazy val lagomServer = serverFor[ReactivegoosService](wire[ReactivegoosServiceImpl])

  // Register the JSON serializer registry
  override lazy val jsonSerializerRegistry = ReactivegoosSerializerRegistry

  // Register the reactive-goos persistent entity
  persistentEntityRegistry.register(wire[ReactivegoosEntity])
}
