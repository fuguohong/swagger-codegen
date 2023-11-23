# coding: utf-8

"""
    Swagger Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.pet_api import PetApi  # noqa: E501
from swagger_client.rest import ApiException


class TestPetApi(unittest.TestCase):
    """PetApi unit test stubs"""

    def setUp(self):
        self.api = PetApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_add_pet(self):
        """Test case for add_pet

        Add a new pet to the store  # noqa: E501
        """
        pass

    def test_delete_pet(self):
        """Test case for delete_pet

        Deletes a pet  # noqa: E501
        """
        pass

    def test_do_category_stuff(self):
        """Test case for do_category_stuff

        """
        pass

    def test_find_pets_by_status(self):
        """Test case for find_pets_by_status

        Finds Pets by status  # noqa: E501
        """
        pass

    def test_find_pets_by_tags(self):
        """Test case for find_pets_by_tags

        Finds Pets by tags  # noqa: E501
        """
        pass

    def test_get_all_pets(self):
        """Test case for get_all_pets

        """
        pass

    def test_get_pet_by_id(self):
        """Test case for get_pet_by_id

        Find pet by ID  # noqa: E501
        """
        pass

    def test_get_random_pet(self):
        """Test case for get_random_pet

        """
        pass

    def test_update_pet(self):
        """Test case for update_pet

        Update an existing pet  # noqa: E501
        """
        pass

    def test_update_pet_with_form(self):
        """Test case for update_pet_with_form

        Updates a pet in the store with form data  # noqa: E501
        """
        pass

    def test_upload_file(self):
        """Test case for upload_file

        uploads an image  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
