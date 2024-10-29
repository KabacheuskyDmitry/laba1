/*
 * Copyright (c) 2013, 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package demo.parallel;


/**
 * A complex number is a number that can be expressed in the form a + b * i, where
 * a and b are real numbers and i is the imaginary unit, which satisfies the
 * equation i ^ 2 = -1. a is the real part and b is the imaginary part of the
 * complex number.
 * <p><i>
 * This source code is provided to illustrate the usage of a given feature
 * or technique and has been deliberately simplified. Additional steps
 * required for a production-quality application, such as security checks,
 * input validation and proper error handling, might not be present in
 * this sample code.</i>
 * @author Alexander Kouznetsov, Tristan Yan
 */
public class Complex {
    private final double re; // Real part
    private final double im; // Imaginary part

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // Method to calculate the squared length (magnitude) of the complex number
    public double lengthSQ() {
        return re * re + im * im; // |z|^2 = a^2 + b^2
    }

    // Addition
    public Complex plus(Complex other) {
        return new Complex(this.re + other.re, this.im + other.im);
    }

    // Multiplication
    public Complex times(Complex other) {
        return new Complex(this.re * other.re - this.im * other.im,
                this.re * other.im + this.im * other.re);
    }

    // Subtraction
    public Complex minus(Complex other) {
        return new Complex(this.re - other.re, this.im - other.im);
    }

    // Division
    public Complex divide(Complex other) {
        double denominator = other.re * other.re + other.im * other.im;
        return new Complex((this.re * other.re + this.im * other.im) / denominator,
                (this.im * other.re - this.re * other.im) / denominator);
    }

    // Power
    public Complex power(int exponent) {
        Complex result = new Complex(1, 0); // Initial value for 0th power
        for (int i = 0; i < exponent; i++) {
            result = result.times(this);
        }
        return result;
    }

    // Other methods (e.g., conjugate, etc.) can be added as needed
}