package com.existme.testee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api")
@Stateless
public class CityResource {

    @PersistenceContext(unitName = "pu")
    EntityManager em;

    @GET
    @Path("/city")
    @Produces("application/json")
    public Response listCities() {
        List resultList = em.createQuery("select c from CityEntity c").getResultList();
        return Response.status(200).entity(resultList).build();
    }
}
