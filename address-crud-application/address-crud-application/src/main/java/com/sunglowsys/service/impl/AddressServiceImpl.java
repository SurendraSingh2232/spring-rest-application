package com.sunglowsys.service.impl;

import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepository;
import com.sunglowsys.service.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    private final Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address save(Address address) {
        log.debug("Service Request to save Address: {}",address);
        return addressRepository.save(address);
    }

    @Override
    public Address update(Address address, Long id) {
        log.debug("Service Request to update Address: {}",address);
        return addressRepository.save(address);
    }

    @Override
    public Page<Address> getAll(Pageable pageable) {
        log.debug("Service Request to getAll Address: {}",pageable);
        return addressRepository.findAll(pageable);
    }

    @Override
    public Optional<Address> findById(Long id) {
        log.debug("Service Request to get Address ById: {}",id);
        return addressRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Service Request to delete Address: {}",id);
        addressRepository.deleteById(id);
    }
}
