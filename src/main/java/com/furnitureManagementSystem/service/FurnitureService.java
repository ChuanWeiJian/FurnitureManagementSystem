package com.furnitureManagementSystem.service;

import java.util.List;

import com.furnitureManagementSystem.shared.PaginationParameter;
import com.furnitureManagementSystem.shared.dto.FurnitureDto;

public interface FurnitureService {
	FurnitureDto insertNewFurniture(FurnitureDto furniture);

	FurnitureDto getFurniture(String furnitureId);

	List<FurnitureDto> getFurnitures(PaginationParameter pagination);

	FurnitureDto updateFurniture(String furnitureId, FurnitureDto furniture);

	void deleteFurniture(String furnitureId);
}
