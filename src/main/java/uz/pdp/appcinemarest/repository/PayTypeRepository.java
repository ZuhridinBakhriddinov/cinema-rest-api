package uz.pdp.appcinemarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appcinemarest.entity.CashBox;
import uz.pdp.appcinemarest.entity.PayType;
import uz.pdp.appcinemarest.projection.CustomCashBox;
import uz.pdp.appcinemarest.projection.CustomPayType;

@RepositoryRestResource(path = "director",collectionResourceRel = "list",excerptProjection = CustomPayType.class)
public interface PayTypeRepository extends JpaRepository<PayType,Integer> {
}
