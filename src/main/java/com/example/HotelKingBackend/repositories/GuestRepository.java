package com.example.HotelKingBackend.repositories;

import com.example.HotelKingBackend.models.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
    Optional<Guest> findByEmail(String email);
    List<Guest> deleteGuestsByEmail(String email);
    Optional<Guest> findFirstByOrderByGuestIdDesc();
}