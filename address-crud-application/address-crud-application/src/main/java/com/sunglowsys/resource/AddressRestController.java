package com.sunglowsys.resource;

import com.sunglowsys.domain.Address;
import com.sunglowsys.service.AddressService;
import com.sunglowsys.util.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class AddressRestController {
    private final Logger log = LoggerFactory.getLogger(AddressRestController.class);

    private final AddressService addressService;

    public AddressRestController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/addresses")
    public ResponseEntity<Address> createAddress(@RequestBody Address address) throws URISyntaxException {
        log.debug("REST Request to create Address : {}",address);
        if (address.getId() != null){
            throw new BadRequestException("Id should be null in create api call");
        }
        Address result = addressService.save(address);
        return ResponseEntity
                .created(new URI("/api/addresses"))
                .body(result);
    }
    @PutMapping("/addresses/{id}")
    public ResponseEntity<Address> updateAddress(@RequestBody Address address, @PathVariable("id") Long id) throws URISyntaxException {
        log.debug("REST Request to update Address : {}",address);
        if (address.getId() == null){
            throw new BadRequestException("Id should not be null in update api call");
        }
        Address result = addressService.update(address,id);
        return ResponseEntity
                .created(new URI("/api/addresses/id")).body(result);
    }
    @GetMapping("/addresses")
    public  ResponseEntity<Page<Address>> getAllHotels(Pageable pageable){
        log.debug("REST Request to getAll Address: {}", pageable);
        Page<Address> result = addressService.getAll(pageable);
        return  ResponseEntity
                .ok()
                .body(result);
    }
    @GetMapping("/addresses/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable("id") Long id){
        log.debug("REST Request to get Address by Id: {} ",id);
        Address result = addressService.findById(id).get();
        return ResponseEntity
                .ok()
                .body(result);
    }
    @DeleteMapping("/addresses/{id}")
    public ResponseEntity<?> deleteHotelById(@PathVariable("id") Long id ){
        log.debug("REST Request to delete Address: {} ",id);
        addressService.delete(id);
        return ResponseEntity
                .ok()
                .body(id);
    }

}
