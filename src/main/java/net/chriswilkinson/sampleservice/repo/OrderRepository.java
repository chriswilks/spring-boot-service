package net.chriswilkinson.sampleservice.repo;

import net.chriswilkinson.sampleservice.entity.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by chrisw on 13/06/2016.
 */
@RepositoryRestResource
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
}
