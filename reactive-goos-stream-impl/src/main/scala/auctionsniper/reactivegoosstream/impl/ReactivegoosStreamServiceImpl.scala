package auctionsniper.reactivegoosstream.impl

import com.lightbend.lagom.scaladsl.api.ServiceCall
import auctionsniper.reactivegoosstream.api.ReactivegoosStreamService
import auctionsniper.reactivegoos.api.ReactivegoosService

import scala.concurrent.Future

/**
  * Implementation of the ReactivegoosStreamService.
  */
class ReactivegoosStreamServiceImpl(reactivegoosService: ReactivegoosService) extends ReactivegoosStreamService {
  def stream = ServiceCall { hellos =>
    Future.successful(hellos.mapAsync(8)(reactivegoosService.hello(_).invoke()))
  }
}
