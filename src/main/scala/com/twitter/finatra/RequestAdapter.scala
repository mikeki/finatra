/**
 * Copyright (C) 2012 Twitter Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.twitter.finatra

import com.twitter.finagle.http.{Request => FinagleRequest}
/**
* Adapts an HttpRequest to a (Finatra) Request
*/

object RequestAdapter extends Logging {

//  def pathOf(x:String) = x.split('?').head
//
//  def paramsOf(request: HttpRequest) = {
//    val fakeQs = "/?" + new String(request.getContent.array)
//    val qs = new QueryStringDecoder(request.getUri)
//    val bs = new QueryStringDecoder(fakeQs)
//    var paramsHash = Map[String,String]()
//    val allParams = qs.getParameters ++ bs.getParameters
//
//    allParams.foreach { xs =>
//      paramsHash += Tuple2(xs._1, xs._2.head)
//    }
//
//    paramsHash
//  }
//
//  def headersOf(request: HttpRequest) = {
//    var headers = Map[String,String]()
//    request.getHeaderNames.foreach { name =>
//      headers += Tuple2(name, request.getHeader(name))
//    }
//    headers
//  }
//
//  def cookiesOf(request: HttpRequest) = {
//    var cookies: Map[String, Cookie] = Map()
//    val cookie = request.getHeader("Cookie")
//    if(cookie != null){
//      val decodedCookie = new CookieDecoder().decode(cookie)
//      decodedCookie.foreach { xs =>
//        cookies += Tuple2(xs.getName, xs)
//      }
//    }
//    cookies
//  }

  def apply(rawRequest: FinagleRequest): Request = {
    logger.info("%s", rawRequest)

    val request = new Request(rawRequest)


    //TODO: make these more efficient
//    request.path        (pathOf(rawRequest.getUri))
//    request.method      (rawRequest.getMethod.toString)
//    request.params      (paramsOf(rawRequest))
//    request.headers     (headersOf(rawRequest))
//    request.cookies     (cookiesOf(rawRequest))
//    request.body        (rawRequest.getContent.array)
//    request.multiParams = MultipartParsing.loadMultiParams(request)

    request
  }
}
