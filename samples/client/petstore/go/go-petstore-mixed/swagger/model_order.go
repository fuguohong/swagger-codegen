/*
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

import (
	"time"
)

type Order struct {
	Id       int64     `json:"id,omitempty"`
	PetId    int64     `json:"petId,omitempty"`
	Quantity int32     `json:"quantity,omitempty"`
	ShipDate time.Time `json:"shipDate,omitempty"`
	// Order Status
	Status   string `json:"status,omitempty"`
	Complete bool   `json:"complete,omitempty"`
}
