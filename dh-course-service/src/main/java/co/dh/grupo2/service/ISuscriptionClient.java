package co.dh.grupo2.service;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.dh.grupo2.configuration.CustomLoadBalancerConfiguration;
import co.dh.grupo2.entity.Suscripcion;

@FeignClient(name = "ms-subscription")
@LoadBalancerClient(name = "ms-subscription", configuration = CustomLoadBalancerConfiguration.class)
public interface ISuscriptionClient {

	@RequestMapping(method = RequestMethod.GET, value = "/subscription/find")
	Suscripcion getSuscripcionWithClientID(@RequestParam("userId") int userID);

}
