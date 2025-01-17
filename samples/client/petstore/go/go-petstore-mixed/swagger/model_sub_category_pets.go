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

type SubCategoryPets struct {
	Id        int64     `json:"id,omitempty"`
	Category  *Category `json:"category,omitempty"`
	Name      string    `json:"name"`
	PhotoUrls []string  `json:"photoUrls"`
	Tags      []Tag     `json:"tags,omitempty"`
	// pet status in the store
	Status string `json:"status,omitempty"`
}
