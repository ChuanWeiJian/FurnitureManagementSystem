package com.furnitureManagementSystem.shared;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class PaginationParameter {
	private int page;
	private int limit;

	public PaginationParameter(int page, int limit) {
		this.page = page;
		this.limit = limit;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public Pageable getPageableRequest() {
		if (this.page > 0)
			this.page = this.page - 1;

		Pageable pageableRequest = PageRequest.of(this.page, this.limit);

		return pageableRequest;
	}
}
