package com.zerobase.api.loan.review

import com.zerobase.com.zerobase.api.loan.review.LoanReviewDto
import org.springframework.cache.annotation.Cacheable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/fintech/api/v1")
class LoanReviewController(
    private val loanReviewServiceImpl: LoanReviewServiceImpl
) {
    @GetMapping("review/{userKey}")
    fun getReviewData(
        @PathVariable userKey: String
    ): ResponseEntity<LoanReviewDto.LoanReviewResponseDto> {
        return ResponseEntity.ok(
            loanReviewServiceImpl.loanReviewMain(userKey)
        )
    }
}