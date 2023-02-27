package com.spring.cocomarket.Iservices;

import com.spring.cocomarket.entities.Contract;
import java.util.List;

public interface IContractService {
    List<Contract> getContracts();

    Contract getContractById(Long id);

    Contract createContract(Contract contract);

    Contract updateContract(Long id, Contract contract);

    void deleteContract(Long id);
}




