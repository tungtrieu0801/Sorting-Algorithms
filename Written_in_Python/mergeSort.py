def merge_sort(arr):
    length = len(arr)
    if length <= 1:
        return arr
    middle = length // 2
    left_arr = arr[:middle]
    right_arr = arr[middle:]

    left_arr = merge_sort(left_arr)
    right_arr = merge_sort(right_arr)

    return merge(left_arr, right_arr)

def merge(left_arr, right_arr):
    result = []
    left, right = 0, 0

    while left < len(left_arr) and right < len(right_arr):
        if left_arr[left] < right_arr[right]:
            result.append(left_arr[left])
            left += 1
        else:
            result.append(right_arr[right])
            right += 1

    while left < len(left_arr):
        result.append(left_arr[left])
        left += 1

    while right < len(right_arr):
        result.append(right_arr[right])
        right += 1

    return result


# Example Usage
arr = [8, 2, 4, 3, 1, 5, 7, 12]
sorted_arr = merge_sort(arr)
print("Sorted Array:", sorted_arr)
