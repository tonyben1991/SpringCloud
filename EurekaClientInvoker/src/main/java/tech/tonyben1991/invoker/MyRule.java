package tech.tonyben1991.invoker;

import java.util.List;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

public class MyRule implements IRule{

	ILoadBalancer lb;
	public Server choose(Object key) {
		List<Server>  servers = lb.getAllServers();
		return servers.get(0);
	}

	public void setLoadBalancer(ILoadBalancer lb) {
		this.lb = lb;
		
	}

	public ILoadBalancer getLoadBalancer() {
		return this.lb;
	}

}
