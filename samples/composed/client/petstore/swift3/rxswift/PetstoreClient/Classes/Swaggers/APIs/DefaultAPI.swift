//
// DefaultAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire
import RxSwift


open class DefaultAPI: APIBase {
    /**
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func testMethod(completion: @escaping ((_ data: [Test]?, _ error: ErrorResponse?) -> Void)) {
        testMethodWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }

    /**
     - returns: Observable<[Test]>
     */
    open class func testMethod() -> Observable<[Test]> {
        return Observable.create { observer -> Disposable in
            testMethod() { data, error in
                if let error = error {
                    observer.on(.error(error as Error))
                } else {
                    observer.on(.next(data!))
                }
                observer.on(.completed)
            }
            return Disposables.create()
        }
    }

    /**
     - GET /test
     - :
       - type: http
       - name: bearer
     - examples: [{contentType=application/json, example=[ "", "" ]}]
     - returns: RequestBuilder<[Test]> 
     */
    open class func testMethodWithRequestBuilder() -> RequestBuilder<[Test]> {
        let path = "/test"
        let URLString = PetstoreClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[Test]>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
