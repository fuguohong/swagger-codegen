/*
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package petstore

import (
	"os"
	"time"
)

type Body3 struct {
	// None
	Integer int32 `json:"integer,omitempty"`
	// None
	Int32_ int32 `json:"int32,omitempty"`
	// None
	Int64_ int64 `json:"int64,omitempty"`
	// None
	Number float64 `json:"number"`
	// None
	Float float32 `json:"float,omitempty"`
	// None
	Double float64 `json:"double"`
	// None
	String_ string `json:"string,omitempty"`
	// None
	PatternWithoutDelimiter string `json:"pattern_without_delimiter"`
	// None
	Byte_ string `json:"byte"`
	// None
	Binary **os.File `json:"binary,omitempty"`
	// None
	Date string `json:"date,omitempty"`
	// None
	DateTime time.Time `json:"dateTime,omitempty"`
	// None
	Password string `json:"password,omitempty"`
	// None
	Callback string `json:"callback,omitempty"`
}
