package lk.ems.projects.drs.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

import lk.ems.projects.drs.entity.Item;

public interface ItemRepository extends DataTablesRepository<Item, Long>{

}
