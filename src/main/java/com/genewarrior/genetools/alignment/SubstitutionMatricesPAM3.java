/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.genewarrior.genetools.alignment;

//13

/**
 * Data obtained from ftp://ftp.ncbi.nih.gov/blast/matrices/
 *
 */
public final class SubstitutionMatricesPAM3 {

    public SubstitutionMatrix[] pam = new SubstitutionMatrix[25];

    public SubstitutionMatricesPAM3() {

        for (int i = 0; i < 25; i++)
            pam[i] = new SubstitutionMatrix();
        initialize();
    }

    private void initialize() {
//PAM 140
        pam[13].name = "PAM";
        pam[13].distance = 140;
        pam[13].gapcost = -8;
        pam[13].matrix = new int[26][26];
        pam[13].matrix[1][1] = 3; //PAM140: From A to A
        pam[13].matrix[1][2] = -2; //PAM140: From A to R
        pam[13].matrix[1][3] = 0; //PAM140: From A to N
        pam[13].matrix[1][4] = 0; //PAM140: From A to D
        pam[13].matrix[1][5] = -2; //PAM140: From A to C
        pam[13].matrix[1][6] = -1; //PAM140: From A to Q
        pam[13].matrix[1][7] = 0; //PAM140: From A to E
        pam[13].matrix[1][8] = 1; //PAM140: From A to G
        pam[13].matrix[1][9] = -2; //PAM140: From A to H
        pam[13].matrix[1][10] = -1; //PAM140: From A to I
        pam[13].matrix[1][11] = -2; //PAM140: From A to L
        pam[13].matrix[1][12] = -2; //PAM140: From A to K
        pam[13].matrix[1][13] = -2; //PAM140: From A to M
        pam[13].matrix[1][14] = -4; //PAM140: From A to F
        pam[13].matrix[1][15] = 1; //PAM140: From A to P
        pam[13].matrix[1][17] = 1; //PAM140: From A to S
        pam[13].matrix[1][19] = 1; //PAM140: From A to T
        pam[13].matrix[1][20] = -6; //PAM140: From A to W
        pam[13].matrix[1][21] = -4; //PAM140: From A to Y
        pam[13].matrix[1][22] = 0; //PAM140: From A to V
        pam[13].matrix[1][23] = 0; //PAM140: From A to B
        pam[13].matrix[1][24] = 0; //PAM140: From A to Z
        pam[13].matrix[1][25] = -1; //PAM140: From A to X
        pam[13].matrix[1][0] = -8; //PAM140: From A to -
        pam[13].matrix[2][1] = -2; //PAM140: From R to A
        pam[13].matrix[2][2] = 6; //PAM140: From R to R
        pam[13].matrix[2][3] = -1; //PAM140: From R to N
        pam[13].matrix[2][4] = -3; //PAM140: From R to D
        pam[13].matrix[2][5] = -4; //PAM140: From R to C
        pam[13].matrix[2][6] = 1; //PAM140: From R to Q
        pam[13].matrix[2][7] = -2; //PAM140: From R to E
        pam[13].matrix[2][8] = -4; //PAM140: From R to G
        pam[13].matrix[2][9] = 1; //PAM140: From R to H
        pam[13].matrix[2][10] = -2; //PAM140: From R to I
        pam[13].matrix[2][11] = -4; //PAM140: From R to L
        pam[13].matrix[2][12] = 3; //PAM140: From R to K
        pam[13].matrix[2][13] = -1; //PAM140: From R to M
        pam[13].matrix[2][14] = -5; //PAM140: From R to F
        pam[13].matrix[2][15] = -1; //PAM140: From R to P
        pam[13].matrix[2][17] = -1; //PAM140: From R to S
        pam[13].matrix[2][19] = -2; //PAM140: From R to T
        pam[13].matrix[2][20] = 1; //PAM140: From R to W
        pam[13].matrix[2][21] = -5; //PAM140: From R to Y
        pam[13].matrix[2][22] = -3; //PAM140: From R to V
        pam[13].matrix[2][23] = -2; //PAM140: From R to B
        pam[13].matrix[2][24] = -1; //PAM140: From R to Z
        pam[13].matrix[2][25] = -1; //PAM140: From R to X
        pam[13].matrix[2][0] = -8; //PAM140: From R to -
        pam[13].matrix[3][1] = 0; //PAM140: From N to A
        pam[13].matrix[3][2] = -1; //PAM140: From N to R
        pam[13].matrix[3][3] = 3; //PAM140: From N to N
        pam[13].matrix[3][4] = 2; //PAM140: From N to D
        pam[13].matrix[3][5] = -4; //PAM140: From N to C
        pam[13].matrix[3][6] = 0; //PAM140: From N to Q
        pam[13].matrix[3][7] = 1; //PAM140: From N to E
        pam[13].matrix[3][8] = 0; //PAM140: From N to G
        pam[13].matrix[3][9] = 2; //PAM140: From N to H
        pam[13].matrix[3][10] = -2; //PAM140: From N to I
        pam[13].matrix[3][11] = -3; //PAM140: From N to L
        pam[13].matrix[3][12] = 1; //PAM140: From N to K
        pam[13].matrix[3][13] = -2; //PAM140: From N to M
        pam[13].matrix[3][14] = -4; //PAM140: From N to F
        pam[13].matrix[3][15] = -1; //PAM140: From N to P
        pam[13].matrix[3][17] = 1; //PAM140: From N to S
        pam[13].matrix[3][19] = 0; //PAM140: From N to T
        pam[13].matrix[3][20] = -4; //PAM140: From N to W
        pam[13].matrix[3][21] = -2; //PAM140: From N to Y
        pam[13].matrix[3][22] = -2; //PAM140: From N to V
        pam[13].matrix[3][23] = 3; //PAM140: From N to B
        pam[13].matrix[3][24] = 1; //PAM140: From N to Z
        pam[13].matrix[3][25] = -1; //PAM140: From N to X
        pam[13].matrix[3][0] = -8; //PAM140: From N to -
        pam[13].matrix[4][1] = 0; //PAM140: From D to A
        pam[13].matrix[4][2] = -3; //PAM140: From D to R
        pam[13].matrix[4][3] = 2; //PAM140: From D to N
        pam[13].matrix[4][4] = 4; //PAM140: From D to D
        pam[13].matrix[4][5] = -6; //PAM140: From D to C
        pam[13].matrix[4][6] = 1; //PAM140: From D to Q
        pam[13].matrix[4][7] = 3; //PAM140: From D to E
        pam[13].matrix[4][8] = 0; //PAM140: From D to G
        pam[13].matrix[4][9] = 0; //PAM140: From D to H
        pam[13].matrix[4][10] = -3; //PAM140: From D to I
        pam[13].matrix[4][11] = -5; //PAM140: From D to L
        pam[13].matrix[4][12] = -1; //PAM140: From D to K
        pam[13].matrix[4][13] = -4; //PAM140: From D to M
        pam[13].matrix[4][14] = -6; //PAM140: From D to F
        pam[13].matrix[4][15] = -2; //PAM140: From D to P
        pam[13].matrix[4][17] = 0; //PAM140: From D to S
        pam[13].matrix[4][19] = -1; //PAM140: From D to T
        pam[13].matrix[4][20] = -7; //PAM140: From D to W
        pam[13].matrix[4][21] = -5; //PAM140: From D to Y
        pam[13].matrix[4][22] = -3; //PAM140: From D to V
        pam[13].matrix[4][23] = 4; //PAM140: From D to B
        pam[13].matrix[4][24] = 3; //PAM140: From D to Z
        pam[13].matrix[4][25] = -1; //PAM140: From D to X
        pam[13].matrix[4][0] = -8; //PAM140: From D to -
        pam[13].matrix[5][1] = -2; //PAM140: From C to A
        pam[13].matrix[5][2] = -4; //PAM140: From C to R
        pam[13].matrix[5][3] = -4; //PAM140: From C to N
        pam[13].matrix[5][4] = -6; //PAM140: From C to D
        pam[13].matrix[5][5] = 9; //PAM140: From C to C
        pam[13].matrix[5][6] = -6; //PAM140: From C to Q
        pam[13].matrix[5][7] = -6; //PAM140: From C to E
        pam[13].matrix[5][8] = -4; //PAM140: From C to G
        pam[13].matrix[5][9] = -4; //PAM140: From C to H
        pam[13].matrix[5][10] = -3; //PAM140: From C to I
        pam[13].matrix[5][11] = -7; //PAM140: From C to L
        pam[13].matrix[5][12] = -6; //PAM140: From C to K
        pam[13].matrix[5][13] = -6; //PAM140: From C to M
        pam[13].matrix[5][14] = -5; //PAM140: From C to F
        pam[13].matrix[5][15] = -3; //PAM140: From C to P
        pam[13].matrix[5][17] = 0; //PAM140: From C to S
        pam[13].matrix[5][19] = -3; //PAM140: From C to T
        pam[13].matrix[5][20] = -8; //PAM140: From C to W
        pam[13].matrix[5][21] = -1; //PAM140: From C to Y
        pam[13].matrix[5][22] = -2; //PAM140: From C to V
        pam[13].matrix[5][23] = -5; //PAM140: From C to B
        pam[13].matrix[5][24] = -6; //PAM140: From C to Z
        pam[13].matrix[5][25] = -4; //PAM140: From C to X
        pam[13].matrix[5][0] = -8; //PAM140: From C to -
        pam[13].matrix[6][1] = -1; //PAM140: From Q to A
        pam[13].matrix[6][2] = 1; //PAM140: From Q to R
        pam[13].matrix[6][3] = 0; //PAM140: From Q to N
        pam[13].matrix[6][4] = 1; //PAM140: From Q to D
        pam[13].matrix[6][5] = -6; //PAM140: From Q to C
        pam[13].matrix[6][6] = 5; //PAM140: From Q to Q
        pam[13].matrix[6][7] = 2; //PAM140: From Q to E
        pam[13].matrix[6][8] = -2; //PAM140: From Q to G
        pam[13].matrix[6][9] = 3; //PAM140: From Q to H
        pam[13].matrix[6][10] = -3; //PAM140: From Q to I
        pam[13].matrix[6][11] = -2; //PAM140: From Q to L
        pam[13].matrix[6][12] = 0; //PAM140: From Q to K
        pam[13].matrix[6][13] = -1; //PAM140: From Q to M
        pam[13].matrix[6][14] = -5; //PAM140: From Q to F
        pam[13].matrix[6][15] = 0; //PAM140: From Q to P
        pam[13].matrix[6][17] = -1; //PAM140: From Q to S
        pam[13].matrix[6][19] = -2; //PAM140: From Q to T
        pam[13].matrix[6][20] = -5; //PAM140: From Q to W
        pam[13].matrix[6][21] = -5; //PAM140: From Q to Y
        pam[13].matrix[6][22] = -2; //PAM140: From Q to V
        pam[13].matrix[6][23] = 1; //PAM140: From Q to B
        pam[13].matrix[6][24] = 4; //PAM140: From Q to Z
        pam[13].matrix[6][25] = -1; //PAM140: From Q to X
        pam[13].matrix[6][0] = -8; //PAM140: From Q to -
        pam[13].matrix[7][1] = 0; //PAM140: From E to A
        pam[13].matrix[7][2] = -2; //PAM140: From E to R
        pam[13].matrix[7][3] = 1; //PAM140: From E to N
        pam[13].matrix[7][4] = 3; //PAM140: From E to D
        pam[13].matrix[7][5] = -6; //PAM140: From E to C
        pam[13].matrix[7][6] = 2; //PAM140: From E to Q
        pam[13].matrix[7][7] = 4; //PAM140: From E to E
        pam[13].matrix[7][8] = -1; //PAM140: From E to G
        pam[13].matrix[7][9] = 0; //PAM140: From E to H
        pam[13].matrix[7][10] = -2; //PAM140: From E to I
        pam[13].matrix[7][11] = -4; //PAM140: From E to L
        pam[13].matrix[7][12] = -1; //PAM140: From E to K
        pam[13].matrix[7][13] = -3; //PAM140: From E to M
        pam[13].matrix[7][14] = -6; //PAM140: From E to F
        pam[13].matrix[7][15] = -1; //PAM140: From E to P
        pam[13].matrix[7][17] = -1; //PAM140: From E to S
        pam[13].matrix[7][19] = -1; //PAM140: From E to T
        pam[13].matrix[7][20] = -8; //PAM140: From E to W
        pam[13].matrix[7][21] = -4; //PAM140: From E to Y
        pam[13].matrix[7][22] = -2; //PAM140: From E to V
        pam[13].matrix[7][23] = 2; //PAM140: From E to B
        pam[13].matrix[7][24] = 4; //PAM140: From E to Z
        pam[13].matrix[7][25] = -1; //PAM140: From E to X
        pam[13].matrix[7][0] = -8; //PAM140: From E to -
        pam[13].matrix[8][1] = 1; //PAM140: From G to A
        pam[13].matrix[8][2] = -4; //PAM140: From G to R
        pam[13].matrix[8][3] = 0; //PAM140: From G to N
        pam[13].matrix[8][4] = 0; //PAM140: From G to D
        pam[13].matrix[8][5] = -4; //PAM140: From G to C
        pam[13].matrix[8][6] = -2; //PAM140: From G to Q
        pam[13].matrix[8][7] = -1; //PAM140: From G to E
        pam[13].matrix[8][8] = 5; //PAM140: From G to G
        pam[13].matrix[8][9] = -3; //PAM140: From G to H
        pam[13].matrix[8][10] = -4; //PAM140: From G to I
        pam[13].matrix[8][11] = -5; //PAM140: From G to L
        pam[13].matrix[8][12] = -3; //PAM140: From G to K
        pam[13].matrix[8][13] = -3; //PAM140: From G to M
        pam[13].matrix[8][14] = -5; //PAM140: From G to F
        pam[13].matrix[8][15] = -1; //PAM140: From G to P
        pam[13].matrix[8][17] = 1; //PAM140: From G to S
        pam[13].matrix[8][19] = -1; //PAM140: From G to T
        pam[13].matrix[8][20] = -7; //PAM140: From G to W
        pam[13].matrix[8][21] = -6; //PAM140: From G to Y
        pam[13].matrix[8][22] = -2; //PAM140: From G to V
        pam[13].matrix[8][23] = 0; //PAM140: From G to B
        pam[13].matrix[8][24] = -1; //PAM140: From G to Z
        pam[13].matrix[8][25] = -1; //PAM140: From G to X
        pam[13].matrix[8][0] = -8; //PAM140: From G to -
        pam[13].matrix[9][1] = -2; //PAM140: From H to A
        pam[13].matrix[9][2] = 1; //PAM140: From H to R
        pam[13].matrix[9][3] = 2; //PAM140: From H to N
        pam[13].matrix[9][4] = 0; //PAM140: From H to D
        pam[13].matrix[9][5] = -4; //PAM140: From H to C
        pam[13].matrix[9][6] = 3; //PAM140: From H to Q
        pam[13].matrix[9][7] = 0; //PAM140: From H to E
        pam[13].matrix[9][8] = -3; //PAM140: From H to G
        pam[13].matrix[9][9] = 6; //PAM140: From H to H
        pam[13].matrix[9][10] = -3; //PAM140: From H to I
        pam[13].matrix[9][11] = -2; //PAM140: From H to L
        pam[13].matrix[9][12] = -1; //PAM140: From H to K
        pam[13].matrix[9][13] = -3; //PAM140: From H to M
        pam[13].matrix[9][14] = -2; //PAM140: From H to F
        pam[13].matrix[9][15] = -1; //PAM140: From H to P
        pam[13].matrix[9][17] = -1; //PAM140: From H to S
        pam[13].matrix[9][19] = -2; //PAM140: From H to T
        pam[13].matrix[9][20] = -3; //PAM140: From H to W
        pam[13].matrix[9][21] = 0; //PAM140: From H to Y
        pam[13].matrix[9][22] = -3; //PAM140: From H to V
        pam[13].matrix[9][23] = 1; //PAM140: From H to B
        pam[13].matrix[9][24] = 1; //PAM140: From H to Z
        pam[13].matrix[9][25] = -1; //PAM140: From H to X
        pam[13].matrix[9][0] = -8; //PAM140: From H to -
        pam[13].matrix[10][1] = -1; //PAM140: From I to A
        pam[13].matrix[10][2] = -2; //PAM140: From I to R
        pam[13].matrix[10][3] = -2; //PAM140: From I to N
        pam[13].matrix[10][4] = -3; //PAM140: From I to D
        pam[13].matrix[10][5] = -3; //PAM140: From I to C
        pam[13].matrix[10][6] = -3; //PAM140: From I to Q
        pam[13].matrix[10][7] = -2; //PAM140: From I to E
        pam[13].matrix[10][8] = -4; //PAM140: From I to G
        pam[13].matrix[10][9] = -3; //PAM140: From I to H
        pam[13].matrix[10][10] = 5; //PAM140: From I to I
        pam[13].matrix[10][11] = 1; //PAM140: From I to L
        pam[13].matrix[10][12] = -2; //PAM140: From I to K
        pam[13].matrix[10][13] = 2; //PAM140: From I to M
        pam[13].matrix[10][14] = 0; //PAM140: From I to F
        pam[13].matrix[10][15] = -3; //PAM140: From I to P
        pam[13].matrix[10][17] = -2; //PAM140: From I to S
        pam[13].matrix[10][19] = 0; //PAM140: From I to T
        pam[13].matrix[10][20] = -6; //PAM140: From I to W
        pam[13].matrix[10][21] = -2; //PAM140: From I to Y
        pam[13].matrix[10][22] = 3; //PAM140: From I to V
        pam[13].matrix[10][23] = -2; //PAM140: From I to B
        pam[13].matrix[10][24] = -2; //PAM140: From I to Z
        pam[13].matrix[10][25] = -1; //PAM140: From I to X
        pam[13].matrix[10][0] = -8; //PAM140: From I to -
        pam[13].matrix[11][1] = -2; //PAM140: From L to A
        pam[13].matrix[11][2] = -4; //PAM140: From L to R
        pam[13].matrix[11][3] = -3; //PAM140: From L to N
        pam[13].matrix[11][4] = -5; //PAM140: From L to D
        pam[13].matrix[11][5] = -7; //PAM140: From L to C
        pam[13].matrix[11][6] = -2; //PAM140: From L to Q
        pam[13].matrix[11][7] = -4; //PAM140: From L to E
        pam[13].matrix[11][8] = -5; //PAM140: From L to G
        pam[13].matrix[11][9] = -2; //PAM140: From L to H
        pam[13].matrix[11][10] = 1; //PAM140: From L to I
        pam[13].matrix[11][11] = 5; //PAM140: From L to L
        pam[13].matrix[11][12] = -3; //PAM140: From L to K
        pam[13].matrix[11][13] = 3; //PAM140: From L to M
        pam[13].matrix[11][14] = 1; //PAM140: From L to F
        pam[13].matrix[11][15] = -3; //PAM140: From L to P
        pam[13].matrix[11][17] = -3; //PAM140: From L to S
        pam[13].matrix[11][19] = -2; //PAM140: From L to T
        pam[13].matrix[11][20] = -2; //PAM140: From L to W
        pam[13].matrix[11][21] = -2; //PAM140: From L to Y
        pam[13].matrix[11][22] = 1; //PAM140: From L to V
        pam[13].matrix[11][23] = -4; //PAM140: From L to B
        pam[13].matrix[11][24] = -3; //PAM140: From L to Z
        pam[13].matrix[11][25] = -2; //PAM140: From L to X
        pam[13].matrix[11][0] = -8; //PAM140: From L to -
        pam[13].matrix[12][1] = -2; //PAM140: From K to A
        pam[13].matrix[12][2] = 3; //PAM140: From K to R
        pam[13].matrix[12][3] = 1; //PAM140: From K to N
        pam[13].matrix[12][4] = -1; //PAM140: From K to D
        pam[13].matrix[12][5] = -6; //PAM140: From K to C
        pam[13].matrix[12][6] = 0; //PAM140: From K to Q
        pam[13].matrix[12][7] = -1; //PAM140: From K to E
        pam[13].matrix[12][8] = -3; //PAM140: From K to G
        pam[13].matrix[12][9] = -1; //PAM140: From K to H
        pam[13].matrix[12][10] = -2; //PAM140: From K to I
        pam[13].matrix[12][11] = -3; //PAM140: From K to L
        pam[13].matrix[12][12] = 5; //PAM140: From K to K
        pam[13].matrix[12][13] = 0; //PAM140: From K to M
        pam[13].matrix[12][14] = -6; //PAM140: From K to F
        pam[13].matrix[12][15] = -2; //PAM140: From K to P
        pam[13].matrix[12][17] = -1; //PAM140: From K to S
        pam[13].matrix[12][19] = 0; //PAM140: From K to T
        pam[13].matrix[12][20] = -4; //PAM140: From K to W
        pam[13].matrix[12][21] = -5; //PAM140: From K to Y
        pam[13].matrix[12][22] = -3; //PAM140: From K to V
        pam[13].matrix[12][23] = 0; //PAM140: From K to B
        pam[13].matrix[12][24] = 0; //PAM140: From K to Z
        pam[13].matrix[12][25] = -1; //PAM140: From K to X
        pam[13].matrix[12][0] = -8; //PAM140: From K to -
        pam[13].matrix[13][1] = -2; //PAM140: From M to A
        pam[13].matrix[13][2] = -1; //PAM140: From M to R
        pam[13].matrix[13][3] = -2; //PAM140: From M to N
        pam[13].matrix[13][4] = -4; //PAM140: From M to D
        pam[13].matrix[13][5] = -6; //PAM140: From M to C
        pam[13].matrix[13][6] = -1; //PAM140: From M to Q
        pam[13].matrix[13][7] = -3; //PAM140: From M to E
        pam[13].matrix[13][8] = -3; //PAM140: From M to G
        pam[13].matrix[13][9] = -3; //PAM140: From M to H
        pam[13].matrix[13][10] = 2; //PAM140: From M to I
        pam[13].matrix[13][11] = 3; //PAM140: From M to L
        pam[13].matrix[13][12] = 0; //PAM140: From M to K
        pam[13].matrix[13][13] = 7; //PAM140: From M to M
        pam[13].matrix[13][14] = -1; //PAM140: From M to F
        pam[13].matrix[13][15] = -3; //PAM140: From M to P
        pam[13].matrix[13][17] = -2; //PAM140: From M to S
        pam[13].matrix[13][19] = -1; //PAM140: From M to T
        pam[13].matrix[13][20] = -5; //PAM140: From M to W
        pam[13].matrix[13][21] = -4; //PAM140: From M to Y
        pam[13].matrix[13][22] = 1; //PAM140: From M to V
        pam[13].matrix[13][23] = -3; //PAM140: From M to B
        pam[13].matrix[13][24] = -2; //PAM140: From M to Z
        pam[13].matrix[13][25] = -1; //PAM140: From M to X
        pam[13].matrix[13][0] = -8; //PAM140: From M to -
        pam[13].matrix[14][1] = -4; //PAM140: From F to A
        pam[13].matrix[14][2] = -5; //PAM140: From F to R
        pam[13].matrix[14][3] = -4; //PAM140: From F to N
        pam[13].matrix[14][4] = -6; //PAM140: From F to D
        pam[13].matrix[14][5] = -5; //PAM140: From F to C
        pam[13].matrix[14][6] = -5; //PAM140: From F to Q
        pam[13].matrix[14][7] = -6; //PAM140: From F to E
        pam[13].matrix[14][8] = -5; //PAM140: From F to G
        pam[13].matrix[14][9] = -2; //PAM140: From F to H
        pam[13].matrix[14][10] = 0; //PAM140: From F to I
        pam[13].matrix[14][11] = 1; //PAM140: From F to L
        pam[13].matrix[14][12] = -6; //PAM140: From F to K
        pam[13].matrix[14][13] = -1; //PAM140: From F to M
        pam[13].matrix[14][14] = 7; //PAM140: From F to F
        pam[13].matrix[14][15] = -5; //PAM140: From F to P
        pam[13].matrix[14][17] = -3; //PAM140: From F to S
        pam[13].matrix[14][19] = -4; //PAM140: From F to T
        pam[13].matrix[14][20] = -1; //PAM140: From F to W
        pam[13].matrix[14][21] = 4; //PAM140: From F to Y
        pam[13].matrix[14][22] = -2; //PAM140: From F to V
        pam[13].matrix[14][23] = -5; //PAM140: From F to B
        pam[13].matrix[14][24] = -6; //PAM140: From F to Z
        pam[13].matrix[14][25] = -3; //PAM140: From F to X
        pam[13].matrix[14][0] = -8; //PAM140: From F to -
        pam[13].matrix[15][1] = 1; //PAM140: From P to A
        pam[13].matrix[15][2] = -1; //PAM140: From P to R
        pam[13].matrix[15][3] = -1; //PAM140: From P to N
        pam[13].matrix[15][4] = -2; //PAM140: From P to D
        pam[13].matrix[15][5] = -3; //PAM140: From P to C
        pam[13].matrix[15][6] = 0; //PAM140: From P to Q
        pam[13].matrix[15][7] = -1; //PAM140: From P to E
        pam[13].matrix[15][8] = -1; //PAM140: From P to G
        pam[13].matrix[15][9] = -1; //PAM140: From P to H
        pam[13].matrix[15][10] = -3; //PAM140: From P to I
        pam[13].matrix[15][11] = -3; //PAM140: From P to L
        pam[13].matrix[15][12] = -2; //PAM140: From P to K
        pam[13].matrix[15][13] = -3; //PAM140: From P to M
        pam[13].matrix[15][14] = -5; //PAM140: From P to F
        pam[13].matrix[15][15] = 6; //PAM140: From P to P
        pam[13].matrix[15][17] = 1; //PAM140: From P to S
        pam[13].matrix[15][19] = 0; //PAM140: From P to T
        pam[13].matrix[15][20] = -6; //PAM140: From P to W
        pam[13].matrix[15][21] = -6; //PAM140: From P to Y
        pam[13].matrix[15][22] = -2; //PAM140: From P to V
        pam[13].matrix[15][23] = -2; //PAM140: From P to B
        pam[13].matrix[15][24] = -1; //PAM140: From P to Z
        pam[13].matrix[15][25] = -1; //PAM140: From P to X
        pam[13].matrix[15][0] = -8; //PAM140: From P to -
        pam[13].matrix[17][1] = 1; //PAM140: From S to A
        pam[13].matrix[17][2] = -1; //PAM140: From S to R
        pam[13].matrix[17][3] = 1; //PAM140: From S to N
        pam[13].matrix[17][4] = 0; //PAM140: From S to D
        pam[13].matrix[17][5] = 0; //PAM140: From S to C
        pam[13].matrix[17][6] = -1; //PAM140: From S to Q
        pam[13].matrix[17][7] = -1; //PAM140: From S to E
        pam[13].matrix[17][8] = 1; //PAM140: From S to G
        pam[13].matrix[17][9] = -1; //PAM140: From S to H
        pam[13].matrix[17][10] = -2; //PAM140: From S to I
        pam[13].matrix[17][11] = -3; //PAM140: From S to L
        pam[13].matrix[17][12] = -1; //PAM140: From S to K
        pam[13].matrix[17][13] = -2; //PAM140: From S to M
        pam[13].matrix[17][14] = -3; //PAM140: From S to F
        pam[13].matrix[17][15] = 1; //PAM140: From S to P
        pam[13].matrix[17][17] = 3; //PAM140: From S to S
        pam[13].matrix[17][19] = 2; //PAM140: From S to T
        pam[13].matrix[17][20] = -2; //PAM140: From S to W
        pam[13].matrix[17][21] = -3; //PAM140: From S to Y
        pam[13].matrix[17][22] = -2; //PAM140: From S to V
        pam[13].matrix[17][23] = 0; //PAM140: From S to B
        pam[13].matrix[17][24] = -1; //PAM140: From S to Z
        pam[13].matrix[17][25] = 0; //PAM140: From S to X
        pam[13].matrix[17][0] = -8; //PAM140: From S to -
        pam[13].matrix[19][1] = 1; //PAM140: From T to A
        pam[13].matrix[19][2] = -2; //PAM140: From T to R
        pam[13].matrix[19][3] = 0; //PAM140: From T to N
        pam[13].matrix[19][4] = -1; //PAM140: From T to D
        pam[13].matrix[19][5] = -3; //PAM140: From T to C
        pam[13].matrix[19][6] = -2; //PAM140: From T to Q
        pam[13].matrix[19][7] = -1; //PAM140: From T to E
        pam[13].matrix[19][8] = -1; //PAM140: From T to G
        pam[13].matrix[19][9] = -2; //PAM140: From T to H
        pam[13].matrix[19][10] = 0; //PAM140: From T to I
        pam[13].matrix[19][11] = -2; //PAM140: From T to L
        pam[13].matrix[19][12] = 0; //PAM140: From T to K
        pam[13].matrix[19][13] = -1; //PAM140: From T to M
        pam[13].matrix[19][14] = -4; //PAM140: From T to F
        pam[13].matrix[19][15] = 0; //PAM140: From T to P
        pam[13].matrix[19][17] = 2; //PAM140: From T to S
        pam[13].matrix[19][19] = 4; //PAM140: From T to T
        pam[13].matrix[19][20] = -5; //PAM140: From T to W
        pam[13].matrix[19][21] = -3; //PAM140: From T to Y
        pam[13].matrix[19][22] = 0; //PAM140: From T to V
        pam[13].matrix[19][23] = 0; //PAM140: From T to B
        pam[13].matrix[19][24] = -1; //PAM140: From T to Z
        pam[13].matrix[19][25] = -1; //PAM140: From T to X
        pam[13].matrix[19][0] = -8; //PAM140: From T to -
        pam[13].matrix[20][1] = -6; //PAM140: From W to A
        pam[13].matrix[20][2] = 1; //PAM140: From W to R
        pam[13].matrix[20][3] = -4; //PAM140: From W to N
        pam[13].matrix[20][4] = -7; //PAM140: From W to D
        pam[13].matrix[20][5] = -8; //PAM140: From W to C
        pam[13].matrix[20][6] = -5; //PAM140: From W to Q
        pam[13].matrix[20][7] = -8; //PAM140: From W to E
        pam[13].matrix[20][8] = -7; //PAM140: From W to G
        pam[13].matrix[20][9] = -3; //PAM140: From W to H
        pam[13].matrix[20][10] = -6; //PAM140: From W to I
        pam[13].matrix[20][11] = -2; //PAM140: From W to L
        pam[13].matrix[20][12] = -4; //PAM140: From W to K
        pam[13].matrix[20][13] = -5; //PAM140: From W to M
        pam[13].matrix[20][14] = -1; //PAM140: From W to F
        pam[13].matrix[20][15] = -6; //PAM140: From W to P
        pam[13].matrix[20][17] = -2; //PAM140: From W to S
        pam[13].matrix[20][19] = -5; //PAM140: From W to T
        pam[13].matrix[20][20] = 12; //PAM140: From W to W
        pam[13].matrix[20][21] = -1; //PAM140: From W to Y
        pam[13].matrix[20][22] = -7; //PAM140: From W to V
        pam[13].matrix[20][23] = -5; //PAM140: From W to B
        pam[13].matrix[20][24] = -6; //PAM140: From W to Z
        pam[13].matrix[20][25] = -5; //PAM140: From W to X
        pam[13].matrix[20][0] = -8; //PAM140: From W to -
        pam[13].matrix[21][1] = -4; //PAM140: From Y to A
        pam[13].matrix[21][2] = -5; //PAM140: From Y to R
        pam[13].matrix[21][3] = -2; //PAM140: From Y to N
        pam[13].matrix[21][4] = -5; //PAM140: From Y to D
        pam[13].matrix[21][5] = -1; //PAM140: From Y to C
        pam[13].matrix[21][6] = -5; //PAM140: From Y to Q
        pam[13].matrix[21][7] = -4; //PAM140: From Y to E
        pam[13].matrix[21][8] = -6; //PAM140: From Y to G
        pam[13].matrix[21][9] = 0; //PAM140: From Y to H
        pam[13].matrix[21][10] = -2; //PAM140: From Y to I
        pam[13].matrix[21][11] = -2; //PAM140: From Y to L
        pam[13].matrix[21][12] = -5; //PAM140: From Y to K
        pam[13].matrix[21][13] = -4; //PAM140: From Y to M
        pam[13].matrix[21][14] = 4; //PAM140: From Y to F
        pam[13].matrix[21][15] = -6; //PAM140: From Y to P
        pam[13].matrix[21][17] = -3; //PAM140: From Y to S
        pam[13].matrix[21][19] = -3; //PAM140: From Y to T
        pam[13].matrix[21][20] = -1; //PAM140: From Y to W
        pam[13].matrix[21][21] = 8; //PAM140: From Y to Y
        pam[13].matrix[21][22] = -3; //PAM140: From Y to V
        pam[13].matrix[21][23] = -3; //PAM140: From Y to B
        pam[13].matrix[21][24] = -4; //PAM140: From Y to Z
        pam[13].matrix[21][25] = -3; //PAM140: From Y to X
        pam[13].matrix[21][0] = -8; //PAM140: From Y to -
        pam[13].matrix[22][1] = 0; //PAM140: From V to A
        pam[13].matrix[22][2] = -3; //PAM140: From V to R
        pam[13].matrix[22][3] = -2; //PAM140: From V to N
        pam[13].matrix[22][4] = -3; //PAM140: From V to D
        pam[13].matrix[22][5] = -2; //PAM140: From V to C
        pam[13].matrix[22][6] = -2; //PAM140: From V to Q
        pam[13].matrix[22][7] = -2; //PAM140: From V to E
        pam[13].matrix[22][8] = -2; //PAM140: From V to G
        pam[13].matrix[22][9] = -3; //PAM140: From V to H
        pam[13].matrix[22][10] = 3; //PAM140: From V to I
        pam[13].matrix[22][11] = 1; //PAM140: From V to L
        pam[13].matrix[22][12] = -3; //PAM140: From V to K
        pam[13].matrix[22][13] = 1; //PAM140: From V to M
        pam[13].matrix[22][14] = -2; //PAM140: From V to F
        pam[13].matrix[22][15] = -2; //PAM140: From V to P
        pam[13].matrix[22][17] = -2; //PAM140: From V to S
        pam[13].matrix[22][19] = 0; //PAM140: From V to T
        pam[13].matrix[22][20] = -7; //PAM140: From V to W
        pam[13].matrix[22][21] = -3; //PAM140: From V to Y
        pam[13].matrix[22][22] = 5; //PAM140: From V to V
        pam[13].matrix[22][23] = -3; //PAM140: From V to B
        pam[13].matrix[22][24] = -2; //PAM140: From V to Z
        pam[13].matrix[22][25] = -1; //PAM140: From V to X
        pam[13].matrix[22][0] = -8; //PAM140: From V to -
        pam[13].matrix[23][1] = 0; //PAM140: From B to A
        pam[13].matrix[23][2] = -2; //PAM140: From B to R
        pam[13].matrix[23][3] = 3; //PAM140: From B to N
        pam[13].matrix[23][4] = 4; //PAM140: From B to D
        pam[13].matrix[23][5] = -5; //PAM140: From B to C
        pam[13].matrix[23][6] = 1; //PAM140: From B to Q
        pam[13].matrix[23][7] = 2; //PAM140: From B to E
        pam[13].matrix[23][8] = 0; //PAM140: From B to G
        pam[13].matrix[23][9] = 1; //PAM140: From B to H
        pam[13].matrix[23][10] = -2; //PAM140: From B to I
        pam[13].matrix[23][11] = -4; //PAM140: From B to L
        pam[13].matrix[23][12] = 0; //PAM140: From B to K
        pam[13].matrix[23][13] = -3; //PAM140: From B to M
        pam[13].matrix[23][14] = -5; //PAM140: From B to F
        pam[13].matrix[23][15] = -2; //PAM140: From B to P
        pam[13].matrix[23][17] = 0; //PAM140: From B to S
        pam[13].matrix[23][19] = 0; //PAM140: From B to T
        pam[13].matrix[23][20] = -5; //PAM140: From B to W
        pam[13].matrix[23][21] = -3; //PAM140: From B to Y
        pam[13].matrix[23][22] = -3; //PAM140: From B to V
        pam[13].matrix[23][23] = 3; //PAM140: From B to B
        pam[13].matrix[23][24] = 2; //PAM140: From B to Z
        pam[13].matrix[23][25] = -1; //PAM140: From B to X
        pam[13].matrix[23][0] = -8; //PAM140: From B to -
        pam[13].matrix[24][1] = 0; //PAM140: From Z to A
        pam[13].matrix[24][2] = -1; //PAM140: From Z to R
        pam[13].matrix[24][3] = 1; //PAM140: From Z to N
        pam[13].matrix[24][4] = 3; //PAM140: From Z to D
        pam[13].matrix[24][5] = -6; //PAM140: From Z to C
        pam[13].matrix[24][6] = 4; //PAM140: From Z to Q
        pam[13].matrix[24][7] = 4; //PAM140: From Z to E
        pam[13].matrix[24][8] = -1; //PAM140: From Z to G
        pam[13].matrix[24][9] = 1; //PAM140: From Z to H
        pam[13].matrix[24][10] = -2; //PAM140: From Z to I
        pam[13].matrix[24][11] = -3; //PAM140: From Z to L
        pam[13].matrix[24][12] = 0; //PAM140: From Z to K
        pam[13].matrix[24][13] = -2; //PAM140: From Z to M
        pam[13].matrix[24][14] = -6; //PAM140: From Z to F
        pam[13].matrix[24][15] = -1; //PAM140: From Z to P
        pam[13].matrix[24][17] = -1; //PAM140: From Z to S
        pam[13].matrix[24][19] = -1; //PAM140: From Z to T
        pam[13].matrix[24][20] = -6; //PAM140: From Z to W
        pam[13].matrix[24][21] = -4; //PAM140: From Z to Y
        pam[13].matrix[24][22] = -2; //PAM140: From Z to V
        pam[13].matrix[24][23] = 2; //PAM140: From Z to B
        pam[13].matrix[24][24] = 4; //PAM140: From Z to Z
        pam[13].matrix[24][25] = -1; //PAM140: From Z to X
        pam[13].matrix[24][0] = -8; //PAM140: From Z to -
        pam[13].matrix[25][1] = -1; //PAM140: From X to A
        pam[13].matrix[25][2] = -1; //PAM140: From X to R
        pam[13].matrix[25][3] = -1; //PAM140: From X to N
        pam[13].matrix[25][4] = -1; //PAM140: From X to D
        pam[13].matrix[25][5] = -4; //PAM140: From X to C
        pam[13].matrix[25][6] = -1; //PAM140: From X to Q
        pam[13].matrix[25][7] = -1; //PAM140: From X to E
        pam[13].matrix[25][8] = -1; //PAM140: From X to G
        pam[13].matrix[25][9] = -1; //PAM140: From X to H
        pam[13].matrix[25][10] = -1; //PAM140: From X to I
        pam[13].matrix[25][11] = -2; //PAM140: From X to L
        pam[13].matrix[25][12] = -1; //PAM140: From X to K
        pam[13].matrix[25][13] = -1; //PAM140: From X to M
        pam[13].matrix[25][14] = -3; //PAM140: From X to F
        pam[13].matrix[25][15] = -1; //PAM140: From X to P
        pam[13].matrix[25][17] = 0; //PAM140: From X to S
        pam[13].matrix[25][19] = -1; //PAM140: From X to T
        pam[13].matrix[25][20] = -5; //PAM140: From X to W
        pam[13].matrix[25][21] = -3; //PAM140: From X to Y
        pam[13].matrix[25][22] = -1; //PAM140: From X to V
        pam[13].matrix[25][23] = -1; //PAM140: From X to B
        pam[13].matrix[25][24] = -1; //PAM140: From X to Z
        pam[13].matrix[25][25] = -1; //PAM140: From X to X
        pam[13].matrix[25][0] = -8; //PAM140: From X to -
        pam[13].matrix[0][1] = -8; //PAM140: From - to A
        pam[13].matrix[0][2] = -8; //PAM140: From - to R
        pam[13].matrix[0][3] = -8; //PAM140: From - to N
        pam[13].matrix[0][4] = -8; //PAM140: From - to D
        pam[13].matrix[0][5] = -8; //PAM140: From - to C
        pam[13].matrix[0][6] = -8; //PAM140: From - to Q
        pam[13].matrix[0][7] = -8; //PAM140: From - to E
        pam[13].matrix[0][8] = -8; //PAM140: From - to G
        pam[13].matrix[0][9] = -8; //PAM140: From - to H
        pam[13].matrix[0][10] = -8; //PAM140: From - to I
        pam[13].matrix[0][11] = -8; //PAM140: From - to L
        pam[13].matrix[0][12] = -8; //PAM140: From - to K
        pam[13].matrix[0][13] = -8; //PAM140: From - to M
        pam[13].matrix[0][14] = -8; //PAM140: From - to F
        pam[13].matrix[0][15] = -8; //PAM140: From - to P
        pam[13].matrix[0][17] = -8; //PAM140: From - to S
        pam[13].matrix[0][19] = -8; //PAM140: From - to T
        pam[13].matrix[0][20] = -8; //PAM140: From - to W
        pam[13].matrix[0][21] = -8; //PAM140: From - to Y
        pam[13].matrix[0][22] = -8; //PAM140: From - to V
        pam[13].matrix[0][23] = -8; //PAM140: From - to B
        pam[13].matrix[0][24] = -8; //PAM140: From - to Z
        pam[13].matrix[0][25] = -8; //PAM140: From - to X
        pam[13].matrix[0][0] = 1; //PAM140: From - to -

    }

}
