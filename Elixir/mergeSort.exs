defmodule Sort do

  defp transferElement(list1, list2, sorted_list \\ [])

  defp merge_sort([h | _tail], 1), do: [h]

  defp merge_sort(original_list, length) do
    list1 = original_list |> Enum.slice(0, div(length,2))
    list2 = original_list |> Enum.slice(div(length,2), length-1)
    list1 = merge_sort(list1, length(list1))
    list2 = merge_sort(list2, length(list2))
    transferElement(list1, list2)
  end

  def merge_sort(original_list) do
    merge_sort(original_list, length(original_list))
  end

  defp transferElement(list1, list2, sorted_list) do
    first1 = List.first(list1)
    first2 = List.first(list2)

    sorted_list = if (first1 < first2) do
      sorted_list ++ [first1]
    else
      sorted_list ++ [first2]
    end

    list1 = if (first1 < first2) do
      elem(List.pop_at(list1, 0), 1)
    else
      list1
    end

    list2 = if (first1 >= first2) do
      elem(List.pop_at(list2, 0), 1)
    else
      list2
    end

    if Enum.empty?(list1) do
      sorted_list ++ list2
    else
      if  Enum.empty?(list2) do
        sorted_list ++ list1
      else
        transferElement(list1, list2, sorted_list)
      end
    end
  end

  """
  defp transferAllList(sorted_list, list, 0), do: sorted_list

  defp transferAllList(sorted_list, list, list_length)  do
    tuple = List.pop_at(list, 0)
    transferAllList([elem(tuple, 0) | sorted_list], elem(tuple, 1), (list_length-1))
  end
  """

end
