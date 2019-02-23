package com.korartur.secondsession.algorithms1;

public class MediaOfTwoSortedArray4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int first = -1;
        int second =-1;
        int fv = 0;
        int sv = 0;

        if(total % 2 == 0){

            first = total/2 - 1;
            second = first+1;
        }
        else{
            first = total/2;
            second = first;
        }

        if(nums2.length == 0 || nums1.length > 0 && nums2.length > 0 && nums1[nums1.length-1] <= nums2[0]){

            if(first < nums1.length){
                fv = nums1[first];
            }
            else{
                fv = nums2[first - nums1.length];
            }

            if(second < nums1.length    ){
                sv = nums1[second];
            }
            else{
                sv = nums2[second - nums1.length];
            }

            return  ((double)(fv + sv))/2;
        }
        else if (nums1.length == 0 || nums1.length > 0 && nums2.length > 0 &&  nums2[nums2.length-1] <= nums1[0]){

            if(first < nums2.length){
                fv = nums2[first];
            }
            else{
                fv = nums1[first - nums2.length];
            }

            if(second < nums2.length    ){
                sv = nums2[second];
            }
            else{
                sv = nums1[second - nums2.length];
            }

            return  ((double)(fv + sv))/2;
        }



        return findMedia(nums1, nums2);

    }

    private double findMedia(int[] nums1, int[] nums2){

        int total = nums1.length + nums2.length;
        int desiredMedian = total/2;
        if(total % 2 == 0){
            desiredMedian -= 1;
        }

        int l = 0;
        int h = nums1.length-1;
        double med = 0;

        while (true){

            if(l == nums1.length){
                med = nums2[desiredMedian - nums1.length];
                if(total % 2 == 0){
                    med += Math.min(nums2[desiredMedian - nums1.length  +1 ], nums1[nums1.length - 1]);
                    med /= 2;
                }

                return  med;
            }
            else if(h == -1){
                med = nums2[desiredMedian];
                if(total % 2 == 0){
                    med += Math.min(nums2[desiredMedian +1 ], nums1[0]);
                    med /= 2;
                }

                return  med;
            }

            int mid = l + (h - l)/2;
            int mid2 = desiredMedian - mid - 1;

            if(mid2 < 0){
                if(mid2 == -1 &&  nums1[mid] <= nums2[0]){
                    med = nums1[mid];
                    if(total % 2 == 0){
                        med += Math.min(nums1[mid+1], nums2[0]);
                        med /= 2;
                    }

                    return med;
                }

                h = mid - 1;
                continue;
            }
            else if(mid2 >= nums2.length){
                l = mid + 1;
                continue;
            }

            int mid1Value = nums1[mid];
            int mid2Value = nums2[mid2];

            if(mid < nums1.length - 1 && mid2 < nums2.length - 1 ) {

                int next1 = nums1[mid + 1];
                int next2 = nums2[mid2 + 1];

                if(next1 >= mid2Value && next2 >= mid1Value){
                    med = Math.max(mid1Value, mid2Value);
                    if(total % 2 == 0){
                        med += Math.min(next1, next2);
                        med /= 2;
                    }

                    return  med;
                }
                else if(next1 <= mid2Value){
                    l = mid + 1;
                    continue;
                }
                else{
                    h = mid - 1;
                    continue;
                }
            }
            else if (mid == nums1.length - 1){
                int next2 = nums2[mid2+1];
                if(next2 >= mid1Value){

                    med = Math.max(mid1Value, mid2Value);
                    if(total % 2 == 0){
                        med += next2;
                        med /= 2;
                    }

                    return  med;
                }
                else{
                    h = mid - 1;
                }
            }
            else{
                int next1= nums1[mid + 1];
                if(next1 >= mid2Value){
                    med = Math.max(mid1Value, mid2Value);
                    if(total % 2 == 0){
                        med += next1;
                        med /= 2;
                    }

                    return med;
                }
                else{
                    l = mid + 1;
                }
            }
        }
    }

}
