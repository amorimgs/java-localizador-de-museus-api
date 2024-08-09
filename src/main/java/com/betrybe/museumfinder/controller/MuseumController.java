package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumCreationDto;
import com.betrybe.museumfinder.dto.MuseumDto;
import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumService;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import com.betrybe.museumfinder.util.ModelDtoConverter;
import java.lang.annotation.Retention;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Museum controller.
 */
@RestController
@RequestMapping("/museums")
public class MuseumController {

  private final MuseumServiceInterface museumService;

  /**
   * Instantiates a new Museum controller.
   *
   * @param museumService the museum service
   */
  @Autowired
  public MuseumController(MuseumServiceInterface museumService) {
    this.museumService = museumService;
  }

  /**
   * Gets museum.
   *
   * @param lat         the lat
   * @param lng         the lng
   * @param max_dist_km the max dist km
   * @return the museum
   */
  @GetMapping("/closest")
  public ResponseEntity<MuseumCreationDto> getMuseum(@RequestParam Double lat,
      @RequestParam Double lng,
      @RequestParam Double max_dist_km) {

    Coordinate coordinate = new Coordinate(lat, lng);

    Museum museum = museumService.getClosestMuseum(coordinate, max_dist_km);

    MuseumCreationDto museumDto = ModelDtoConverter.modelToDtoCreat(museum);
    return ResponseEntity.status(HttpStatus.OK).body(museumDto);
  }

  /**
   * Post museum response entity.
   *
   * @param museumCreationDto the museum creation dto
   * @return the response entity
   */
  @PostMapping()
  public ResponseEntity<Museum> postMuseum(MuseumCreationDto museumCreationDto) {
    Museum museum = museumService.createMuseum(ModelDtoConverter.dtoToModel(museumCreationDto));
    return ResponseEntity.status(HttpStatus.CREATED).body(museum);
  }


}
