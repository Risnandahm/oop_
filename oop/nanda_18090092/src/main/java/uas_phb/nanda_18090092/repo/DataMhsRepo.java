package uas_phb.nanda_18090092.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uas_phb.nanda_18090092.entity.DataMhs;

@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}