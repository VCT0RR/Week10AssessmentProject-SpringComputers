/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Mar 17, 2023
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Computer;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {}
