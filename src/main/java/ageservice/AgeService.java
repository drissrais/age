package ageservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "getAge")
public class AgeService implements generated.ageservice.AgeService {
    @Override
    @WebMethod
    public String getAge(Integer naissance) {
        return "Votre âge est de " + (2019 - naissance) + " ans";
    }
}
