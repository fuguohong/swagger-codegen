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

type Pup struct {
	Id        int64             `json:"id,omitempty"`
	Category2 *Category         `json:"category2,omitempty"`
	Pets      []SubCategoryPets `json:"pets,omitempty"`
}
