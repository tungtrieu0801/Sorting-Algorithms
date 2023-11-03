def parition(A, start, end):
    pivot = A[end]
    partIndex = start
    for i in range(start, end):
        if A[i] <= pivot:
            A[i], A[partIndex] = A[partIndex], A[i]
            partIndex += 1
    A[partIndex], A[end] = A[end], A[partIndex]
    return partIndex
def e(A, start, end):
    if start < end:
        partIndex = parition(A, start, end)
        e(A, start, partIndex-1)
        e(A, partIndex+1, end)
    return A
arr = [29, 10, 14, 37, 13]

e(arr, 0, len(arr) - 1)
print( arr)
