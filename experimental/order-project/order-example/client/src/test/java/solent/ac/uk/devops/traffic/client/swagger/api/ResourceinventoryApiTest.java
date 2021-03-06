/*
 * Smart Port API
 * Solent university devops https://github.com/com619-2021
 *
 * OpenAPI spec version: v1
 * Contact: craig.gallen@solent.ac.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package solent.ac.uk.devops.traffic.client.swagger.api;

import solent.ac.uk.devops.traffic.client.swagger.invoker.ApiException;
import org.solent.com504.project.model.dto.ReplyMessage;
import org.solent.com504.project.model.resource.dto.Resource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResourceinventoryApi
 */
@Ignore
public class ResourceinventoryApiTest {

    private final ResourceinventoryApi api = new ResourceinventoryApi();

    /**
     * Delete resource by uuid
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteResourceInventoryByUuidTest() throws ApiException {
        String uuid = null;
        ReplyMessage response = api.deleteResourceInventoryByUuid(uuid);

        // TODO: test validations
    }
    /**
     * Find catalog resource by resource template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResourceInventoryTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        ReplyMessage response = api.getResourceInventory(offset, limit);

        // TODO: test validations
    }
    /**
     * Find catalog resource by resource template (Should be GET but get with resources not allowed in swagger UI)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResourceInventoryByTemplateTest() throws ApiException {
        Resource body = null;
        Integer offset = null;
        Integer limit = null;
        ReplyMessage response = api.getResourceInventoryByTemplate(body, offset, limit);

        // TODO: test validations
    }
    /**
     * Find catalog resource by uuid
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResourceInventoryByuuidTest() throws ApiException {
        String uuid = null;
        ReplyMessage response = api.getResourceInventoryByuuid(uuid);

        // TODO: test validations
    }
    /**
     * Create new resource
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCreateResourceInventoryTest() throws ApiException {
        Resource body = null;
        ReplyMessage response = api.postCreateResourceInventory(body);

        // TODO: test validations
    }
    /**
     * update  Catalog resource
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateResourceInventoryTest() throws ApiException {
        Resource body = null;
        ReplyMessage response = api.putUpdateResourceInventory(body);

        // TODO: test validations
    }
}
