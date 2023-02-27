package com.spring.cocomarket.services;

import com.spring.cocomarket.entities.Contract;
import com.spring.cocomarket.exeptions.ResourceNotFoundException;
import com.spring.cocomarket.repositories.ContractRepository;
import com.spring.cocomarket.Iservices.IContractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements IContractService {
    @Autowired
    private ContractRepository contractRepository;

    @Override
    public List<Contract> getContracts() {
        return contractRepository.findAll();
    }

    @Override
    public Contract getContractById(Long id) {
        return contractRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contract", "contractId", id));
    }

    @Override
    public Contract createContract(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public Contract updateContract(Long id, Contract contract) {
        Contract existingContract = contractRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contract", "contractId", id));

        existingContract.setVendor(contract.getVendor());
        existingContract.setProduct(contract.getProduct());
        existingContract.setQuantity(contract.getQuantity());
        existingContract.setPrice(contract.getPrice());
        existingContract.setStartDate(contract.getStartDate());
        existingContract.setEndDate(contract.getEndDate());
        existingContract.setOffer(contract.getOffer());

        return contractRepository.save(existingContract);
    }

    @Override
    public void deleteContract(Long id) {
        Contract contract = contractRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contract", "contractId", id));

        contractRepository.delete(contract);
    }
}

